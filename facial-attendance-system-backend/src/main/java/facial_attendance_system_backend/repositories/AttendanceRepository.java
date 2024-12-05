package facial_attendance_system_backend.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import facial_attendance_system_backend.models.AttendanceRecord;

public interface AttendanceRepository extends JpaRepository<AttendanceRecord, Long> {
}
