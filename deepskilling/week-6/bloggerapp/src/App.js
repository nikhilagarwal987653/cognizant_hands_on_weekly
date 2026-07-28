import React from "react";
import "./App.css";

import BookDetails from "./Components/BookDetails";
import BlogDetails from "./Components/BlogDetails";
import CourseDetails from "./Components/CourseDetails";

function App() {
  const showBooks = true;
  const showBlogs = true;
  const showCourses = true;

  let bookComponent;

  // Method 1: if-else conditional rendering
  if (showBooks) {
    bookComponent = <BookDetails />;
  } else {
    bookComponent = <h2>Book details are not available.</h2>;
  }

  return (
    <div className="app-container">
      {bookComponent}

      {/* Method 2: Ternary operator */}
      {showBlogs ? (
        <BlogDetails />
      ) : (
        <h2>Blog details are not available.</h2>
      )}

      {/* Method 3: Logical AND operator */}
      {showCourses && <CourseDetails />}
    </div>
  );
}

export default App;