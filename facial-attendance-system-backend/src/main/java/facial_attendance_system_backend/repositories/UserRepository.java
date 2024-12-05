package facial_attendance_system_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import facial_attendance_system_backend.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name); // Custom query to find user by name
}
