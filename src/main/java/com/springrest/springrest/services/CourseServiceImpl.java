package com.springrest.springrest.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService 
{
	@Autowired
	private CourseDao courseDao;
//	List<Course> list;
	
	public CourseServiceImpl()
	{
//		list = new ArrayList<>();
//		list.add(new Course(145,"Java Core","This course contain basics of java",4500.0f));
//		list.add(new Course(146,"Springboot","Creating rest API using Springboot",5000.0f));
//	
	
	}

	@Override
	public List<Course> getCourses()
	{
		
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(int courseId) {
//		Course c=null;
//		for(Course course:list)
//		{
//			if(course.getId()==courseId)
//			{
//				c=course;
//				break;
//			}
//		}
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		
		//list.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
//		list.forEach(e ->{
//			if (e.getId() == course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//				e.setCoursefees(course.getCoursefees());
//			}
//		});
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(int parseInt) {
		
		//list=this.list.stream().filter(e->e.getId()!=parseInt).collect(Collectors.toList());
		Course entity = courseDao.getOne(parseInt); 
		courseDao.delete(entity);
	}



}
