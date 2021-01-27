package com.crisspian.shared

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.crisspian.shared.databinding.TaskItemBinding
import com.crisspian.shared.model.Task

class TaskAdapter: RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {

    private var mListTask = listOf<Task>()

    fun update(lisTask:List<Task>){
        mListTask = lisTask
        notifyDataSetChanged()
    }

    class TaskViewHolder(private val binding:TaskItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(task: Task){
            binding.tvId.text = task.id.toString()
            binding.tvTitle .text = task.title
            binding.tcDescrip.text = task.taskDescription
            binding.checkBox.isChecked = task.state
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        return TaskViewHolder(TaskItemBinding.inflate(LayoutInflater.from(parent.context)))
     }

    override fun getItemCount(): Int = mListTask.size

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
    val task = mListTask[position]
    holder.bind(task)
    }
}