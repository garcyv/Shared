package com.crisspian.shared.model

import androidx.lifecycle.LiveData

class TaskRepository(private val taskDao: TaskDao) {

  val  listAllTask: LiveData<List<Task>> = taskDao.getAllTask()

  // val task:Task = taskDao.getTaskByID(pid:Int)

  suspend   fun createTask(task: Task) {
      taskDao.createTask(task)
  }

   suspend fun deleteTask(task: Task) {
       taskDao.deleteTask(task)
   }

    suspend fun deleteAllTask() {
        taskDao.deleteAllTask()
    }
}