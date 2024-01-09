package com.example.find_my_matzip.navTab.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.find_my_matzip.databinding.FragmentMyPageBinding
import com.example.find_my_matzip.databinding.FragmentProfileBinding
import com.example.find_my_matzip.model.PageUserDto

import com.example.find_my_matzip.navTab.navTabFragment.MyPageFragment
import com.example.find_my_matzip.navTab.navTabFragment.ProfileFragment


class ProfileViewHoder2(val binding: FragmentProfileBinding) : RecyclerView.ViewHolder(binding.root)
//class ProfileAdapter(private val fragment: MyPageFragment, private val profileList
//: List<ProfileDto>) : RecyclerView.Adapter<ProfileAdapter.ProfileViewHolder>()

class ProfileAdapter2 (val context: ProfileFragment,val datas: List<PageUserDto>?)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ProfileViewHoder2(
            FragmentProfileBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {


    }

    override fun getItemCount(): Int {
        return datas?.size ?: 0
    }
//
//    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
//        val binding = (holder as ProfileViewHoder).binding
//        val Item = datas?.get(position)
//
//        binding.userid.text = Item?.userid
//        binding.userName.text=Item?.userName
//        binding.userPhone.text=Item?.userPhone
////        binding.avgScore.text = Item?.avgScore.toString()
//        binding.userRole.text=Item?.userPhone
//
//        Glide.with(context)
//            .load(Item?.userImage)
//            .override(900, 900)
//            .into(binding.userImage)
//
//    }
}