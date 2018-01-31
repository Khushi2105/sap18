package com.sapient.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.sapient.vo.Emp;

public class FileDao implements IDao {

	@Override
	public List<Emp> getEmployee() {
		// TODO Auto-generated method stub
		String [] arr =null;
		String str = null;
		List<Emp> list = new ArrayList<>();
		Emp emp = null;
		try(BufferedReader br = new BufferedReader(new FileReader("sape.txt"))){
			while((str=br.readLine())!=null){
				arr= str.split(",");
				emp = new Emp(Integer.parseInt(arr[0]), arr[1], Double.parseDouble(arr[2]));
				list.add(emp);
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return list;
	}

}
