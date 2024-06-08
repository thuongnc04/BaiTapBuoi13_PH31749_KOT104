package com.ncthuong.btbuoi13_ph31749.repository

import com.ncthuong.btbuoi13_ph31749.room.StudentEntity
import com.ncthuong.btbuoi13_ph31749.room.StudentsDB

class Repository(val studentsDB: StudentsDB) {
    suspend fun addStudentToRoom(studentEntity: StudentEntity){
        studentsDB.studentDao().addStudent(studentEntity)
    }

    fun getAllStudents() = studentsDB.studentDao().getALlStudents()

    suspend fun deleteStudentFromRoom(studentEntity: StudentEntity) {
        studentsDB.studentDao().deleteStudent(studentEntity)
    }

    suspend fun updateStudent(studentEntity: StudentEntity){
        studentsDB.studentDao().updateStudent(studentEntity)
    }
}