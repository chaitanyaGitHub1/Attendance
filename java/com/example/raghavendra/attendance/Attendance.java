package com.example.raghavendra.attendance;

/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;




import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Attendance} shows a list of Android platform releases.
 * For each release, display the name, version number, and image.
 */
public class Attendance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attendancelist);

        // Create an ArrayList of AndroidFlavor objects
        ArrayList<NewAttendance> attendanceInfo = new ArrayList<NewAttendance>();
        attendanceInfo.add(new NewAttendance(1, "abhishek", false));
        attendanceInfo.add(new NewAttendance(2, "abhishek", false));
        attendanceInfo.add(new NewAttendance(3, "abhishek", false));
        attendanceInfo.add(new NewAttendance(4, "abhishek", false));
        attendanceInfo.add(new NewAttendance(5, "abhishek", false));
        attendanceInfo.add(new NewAttendance(6, "abhishek", false));
        attendanceInfo.add(new NewAttendance(7, "abhishek", false));
        attendanceInfo.add(new NewAttendance(8, "abhishek", false));
        attendanceInfo.add(new NewAttendance(9, "abhishek", false));
        attendanceInfo.add(new NewAttendance(10, "abhishek", false));





        // Create an {@link AndroidFlavorAdapter}, whose data source is a list of
        // {@link AndroidFlavor}s. The adapter knows how to create list item views for each item
        // in the list.
        LecturerAttendance attendanceAdapter = new LecturerAttendance(this, attendanceInfo);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_flavor);
        listView.setAdapter(attendanceAdapter);
    }
}
