package ou.phamquangtinh.controller.rest_controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DayLaNoiVietAPI {

    @GetMapping("/first_api")
    public ResponseEntity<?> getFirstAPI(){
        return ResponseEntity.ok(1);
    }
}
