package com.example.sanguis;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
@Database(entities = {TestResult.class},version = 1)
public abstract class AppDatabase extends RoomDatabase{public abstract TestResultDao testResultDao();}