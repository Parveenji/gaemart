package com.parveensapplication.app.modules.gamemart.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.activity.viewModels
import com.parveensapplication.app.R
import com.parveensapplication.app.appcomponents.base.BaseActivity
import com.parveensapplication.app.databinding.ActivityGamemartBinding
import com.parveensapplication.app.modules.androidlargefour.ui.AndroidLargeFourActivity
import com.parveensapplication.app.modules.androidlargesix.ui.AndroidLargeSixActivity
import com.parveensapplication.app.modules.androidlargethree.ui.AndroidLargeThreeActivity
import com.parveensapplication.app.modules.gamemart.`data`.model.ListrectanglesixRowModel
import com.parveensapplication.app.modules.gamemart.`data`.viewmodel.GamemartVM
import com.parveensapplication.app.modules.iphone14plustwo.ui.Iphone14PlusTwoActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class GamemartActivity : BaseActivity<ActivityGamemartBinding>(R.layout.activity_gamemart) {
  private val viewModel: GamemartVM by viewModels<GamemartVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectanglesixAdapter =
    ListrectanglesixAdapter(viewModel.listrectanglesixList.value?:mutableListOf())
    binding.recyclerListrectanglesix.adapter = listrectanglesixAdapter
    listrectanglesixAdapter.setOnItemClickListener(
    object : ListrectanglesixAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListrectanglesixRowModel) {
        onClickRecyclerListrectanglesix(view, position, item)
      }
    }
    )
    viewModel.listrectanglesixList.observe(this) {
      listrectanglesixAdapter.updateData(it)
    }
    binding.gamemartVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = AndroidLargeFourActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.imageIconmenu.setOnClickListener {
        val destIntent = Iphone14PlusTwoActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.txtAboutUs.setOnClickListener {
        val destIntent = AndroidLargeFourActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    fun onClickRecyclerListrectanglesix(
      view: View,
      position: Int,
      item: ListrectanglesixRowModel
    ): Unit {
      when(view.id) {
        R.id.frameStackrectanglesix ->  {
          val destIntent = AndroidLargeThreeActivity.getIntent(this, null)
          startActivity(destIntent)
        }
        R.id.linearRowrectanglesix ->  {
          val destIntent = AndroidLargeSixActivity.getIntent(this, null)
          startActivity(destIntent)
        }
      }
    }

    companion object {
      const val TAG: String = "GAMEMART_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, GamemartActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
