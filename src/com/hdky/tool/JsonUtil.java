package com.hdky.tool;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.hdky.model.Student;


public class JsonUtil {
	public List<Student> StringFromJson (String jsondata)
	{     
		Type listType = new TypeToken<List<Student>>(){}.getType();
		Gson gson=new Gson();
		ArrayList<Student> list=gson.fromJson(jsondata, listType);
		return list;

	}
}
