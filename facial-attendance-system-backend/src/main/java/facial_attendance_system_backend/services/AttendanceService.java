package facial_attendance_system_backend.services;

import org.springframework.stereotype.Service;

import facial_attendance_system_backend.models.AttendanceRecord;
import facial_attendance_system_backend.repositories.AttendanceRepository;

import java.time.LocalDateTime;

@Service
public class AttendanceService {

    private final AttendanceRepository attendanceRepository;

    public AttendanceService(AttendanceRepository attendanceRepository) {
        this.attendanceRepository = attendanceRepository;
    }

    public void markAttendance(Long userId) {
        AttendanceRecord record = new AttendanceRecord();
        record.setUserId(userId);
        record.setTimestamp(LocalDateTime.now());
        attendanceRepository.save(record);
    }
}
