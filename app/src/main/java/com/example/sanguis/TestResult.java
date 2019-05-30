package com.example.sanguis;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class TestResult {
    @PrimaryKey
    public int id;
    public boolean result;
}
