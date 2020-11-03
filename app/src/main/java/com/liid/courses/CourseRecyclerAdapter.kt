package com.liid.courses


import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.liid.R
import com.liid.model.Course
import org.jetbrains.annotations.TestOnly
import kotlin.random.Random

class CourseRecyclerAdapter : RecyclerView.Adapter<CourseRecyclerAdapter.ViewHolder>() {

    var listCourses = ArrayList<Course>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder (
        LayoutInflater.from(parent.context).inflate(R.layout.item_course, parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val course  = listCourses[position] as Course

        holder.tvCourseTitle.text = course.title
        holder.tvCourseStartDate.text = course.start_date
        holder.tvCourseDuration.text = course.duration



    }

    override fun getItemCount() = listCourses.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val tvCourseTitle = itemView.findViewById<TextView>(R.id.item_course_tv_title)
        val tvCourseStartDate = itemView.findViewById<TextView>(R.id.item_course_tv_start_date)
        val tvCourseDuration = itemView.findViewById<TextView>(R.id.item_course_tv_duration)
        var background = itemView.background
    }

    @TestOnly
    fun getRandomColor(): Int {

        var colors = arrayListOf<Int>(
            Color.parseColor("#1768AC"),
            Color.parseColor("#F35A83"),
            Color.parseColor("##4CB1FF")

        )

        val randomValue = Random.nextInt(colors.size)
        return colors[randomValue]
    }
}