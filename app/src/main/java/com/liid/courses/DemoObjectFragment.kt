package com.liid.courses

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.liid.R
import com.liid.model.Course

private const val ARG_OBJECT = "object"
class DemoObjectFragment  : Fragment() {

    private lateinit var courseAdapter: CourseRecyclerAdapter

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.framgnet_demo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.takeIf { it.containsKey(ARG_OBJECT) }?.apply {

            // Create demo course
            var demoCourse = Course()

            // Create demo array
            var demoArray = arrayListOf<Course>(demoCourse, demoCourse, demoCourse, demoCourse, demoCourse, demoCourse, demoCourse)




            courseAdapter = CourseRecyclerAdapter()
            courseAdapter.listCourses = demoArray


            val recyclerView: RecyclerView = view.findViewById(R.id.demo_recycler_view)
            recyclerView.apply {
                layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.VERTICAL, false)
                adapter = courseAdapter
            }
        }
    }
}