package facial_attendance_system_backend.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import facial_attendance_system_backend.services.AttendanceService;
import facial_attendance_system_backend.services.FacialRecognitionService;

@RestController
@RequestMapping("/api/attendance")
public class AttendanceController {

    private final FacialRecognitionService facialRecognitionService;
    private final AttendanceService attendanceService;

    public AttendanceController(FacialRecognitionService facialRecognitionService,
            AttendanceService attendanceService) {
        this.facialRecognitionService = facialRecognitionService;
        this.attendanceService = attendanceService;
    }

    @PostMapping("/mark")
    public ResponseEntity<String> markAttendance(@RequestParam("image") MultipartFile image) {
        // Verify the face
        boolean isMatched = facialRecognitionService.verifyFace(image);

        if (isMatched) {
            attendanceService.markAttendance(1L); // Use real userId after integration
            return ResponseEntity.ok("Access granted and attendance marked.");
        }
        return ResponseEntity.status(401).body("Face not recognized!");
    }
}
