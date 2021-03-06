package task1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import task1.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {

}
