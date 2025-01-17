package com.example.jetpackmvvmlight.ui.adapter

import android.view.ViewGroup
import com.chad.library.adapter.base.BaseQuickAdapter
import com.example.commonlib.*
import com.example.jetpackmvvmlight.databinding.ItemMainBinding
import com.example.jetpackmvvmlight.entity.Describe
import com.example.jetpackmvvmlight.ui.activity.main.view.BriefIntroductionActivity
import com.example.jetpackmvvmlight.ui.activity.main.view.CodeSegmentActivity
import com.example.jetpackmvvmlight.ui.activity.main.view.ComponentsActivity
import com.example.jetpackmvvmlight.ui.activity.main.view.HistoryComponentsActivity

class MainAdapter : BaseQuickAdapter<Describe, BindingViewHolder<ItemMainBinding>>(0) {

    override fun onCreateDefViewHolder(parent: ViewGroup, viewType: Int) =
        newBindingViewHolder<ItemMainBinding>(parent)

    override fun convert(holder: BindingViewHolder<ItemMainBinding>, item: Describe) {
        holder.binding.run {
            tvTitle.text = item.title
            tvContent.text = item.content
            cvContent.onClick { toActivity(holder.layoutPosition) }
        }
    }

    private fun toActivity(position: Int) {
        when (position) {
            0 -> context.startKtxActivity<BriefIntroductionActivity>()
            1 -> context.startKtxActivity<ComponentsActivity>()
            2 -> context.startKtxActivity<CodeSegmentActivity>()
            3 -> context.startKtxActivity<HistoryComponentsActivity>()
        }
    }

}