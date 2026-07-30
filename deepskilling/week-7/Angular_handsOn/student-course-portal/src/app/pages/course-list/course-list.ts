import { Component } from '@angular/core';
import {
  Course,
  CourseCard
} from '../../components/course-card/course-card';

@Component({
  selector: 'app-course-list',
  imports: [CourseCard],
  templateUrl: './course-list.html',
  styleUrl: './course-list.css'
})
export class CourseList {

  selectedCourseId: number | null = null;

  courses: Course[] = [
    {
      id: 1,
      name: 'Angular',
      code: 'ANG101',
      credits: 4
    },
    {
      id: 2,
      name: 'React',
      code: 'RCT102',
      credits: 3
    },
    {
      id: 3,
      name: 'Java',
      code: 'JAV103',
      credits: 4
    },
    {
      id: 4,
      name: 'Spring Boot',
      code: 'SPR104',
      credits: 4
    },
    {
      id: 5,
      name: 'SQL',
      code: 'SQL105',
      credits: 2
    }
  ];

  onEnroll(courseId: number): void {
    console.log('Enrolling in course: ' + courseId);
    this.selectedCourseId = courseId;
  }
}