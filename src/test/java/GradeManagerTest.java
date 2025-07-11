import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class GradeManagerTest {

    private GradeManager manager;

    @BeforeEach
    void setUp(){
        // Create fresh GradeManager for each test
        manager = new GradeManager();
        manager.loadSampleData();
    }

    @Test
    void testAddStudent_Success() {
        // Arrange
        Student newStudent = new Student("Charlie Brown", "S003", "charlie@university.edu");

        // Act
        boolean result = manager.addStudent(newStudent);

        // Assert
        assertTrue(result, "Should successfully add new student");

        Student found = manager.findStudentById("S003");
        assertNotNull(found, "Should be able to find the added student");
        assertEquals("Charlie Brown", found.getName(), "Student name should match");
    }

    @Test
    void testAddStudent_DuplicateId() {
        // Arrange
        Student duplicate = new Student("David Wilson", "S001", "david@university.edu");

        // Act
        boolean result = manager.addStudent(duplicate);

        // Assert
        assertFalse(result, "Should reject duplicate student ID");
    }

    @Test
    void testFindStudentById_Exists() {
        // Act
        Student found = manager.findStudentById("S001");

        // Assert
        assertNotNull(found, "Should find existing student");
        assertEquals("Alice Johnson", found.getName(), "Should return correct student");
    }

    @Test
    void testFindStudentById_NotExists() {
        // Act
        Student found = manager.findStudentById("S999");

        // Assert
        assertNull(found, "Should return null for non-existent student");
    }

    @Test
    void testFindCourseByCode_Exists() {
        // Act
        Course found = manager.findCourseByCode("CS101");

        // Assert
        assertNotNull(found, "Should find existing course");
        assertEquals("Introduction to Programming", found.getCourseName(), "Should return correct course");
    }

    @Test
    void testAddCourse_Success() {
        // Arrange
        Course newCourse = new Course("ENG101", "English Composition", 3.0);

        // Act
        boolean result = manager.addCourse(newCourse);

        // Assert
        assertTrue(result, "Should successfully add new course");

        Course found = manager.findCourseByCode("ENG101");
        assertNotNull(found, "Should be able to find the added course");
        assertEquals("English Composition", found.getCourseName(), "Course name should match");
    }

}
