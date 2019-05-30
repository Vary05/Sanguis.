package com.example.sanguis;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

@Dao
public interface TestResultDao {
@Insert
    void insert(TestResult testResult);
@Query("SELECT * FROM testresult")
TestResult getAll(boolean result);
}
