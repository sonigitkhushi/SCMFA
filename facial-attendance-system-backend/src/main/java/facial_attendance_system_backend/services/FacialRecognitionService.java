package facial_attendance_system_backend.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FacialRecognitionService {
    public boolean verifyFace(MultipartFile image) {
        // Call external facial recognition API or Python service
        return true; // Placeholder logic for testing
    }
}
