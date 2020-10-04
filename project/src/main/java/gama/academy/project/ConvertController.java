package gama.academy.project;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/convert/")
public class ConvertController {

    @GetMapping(path="{seq}")
    public ResponseEntity<String> getResp(@PathVariable Integer seq) {

            if ( seq == 2 )
                return ResponseEntity.ok("a");
            else if (seq == 22)
                return ResponseEntity.ok("b");
            else if (seq == 222)
                return ResponseEntity.ok("c");
            else if (seq == 3)
                return ResponseEntity.ok("d");
            else if (seq == 33)
                return ResponseEntity.ok("e");
            else if (seq == 333)
                return ResponseEntity.ok("f");
            else if (seq == 4)
                return ResponseEntity.ok("g");
            else if (seq == 44)
                return ResponseEntity.ok("h");
            else if (seq == 444)
                return ResponseEntity.ok("i");
            else if (seq == 5)
                return ResponseEntity.ok("j");
            else if (seq == 55)
                return ResponseEntity.ok("k");
            else if (seq == 555)
                return ResponseEntity.ok("l");
            else if (seq == 6)
                return ResponseEntity.ok("m");
            else if (seq == 66)
                return ResponseEntity.ok("n");
            else if (seq == 666)
                return ResponseEntity.ok("o");
            else if (seq == 7)
                return ResponseEntity.ok("p");
            else if (seq == 77)
                return ResponseEntity.ok("q");
            else if (seq == 777)
                return ResponseEntity.ok("r");
            else if (seq == 777)
                return ResponseEntity.ok("s");
            else if (seq == 8)
                return ResponseEntity.ok("t");
            else if (seq == 88)
                return ResponseEntity.ok("u");
            else if (seq == 888)
                return ResponseEntity.ok("v");
            else if (seq == 9)
                return ResponseEntity.ok("w");
            else if (seq == 9)
                return ResponseEntity.ok("w");
            else if (seq == 99)
                return ResponseEntity.ok("x");
            else if (seq == 999)
                return ResponseEntity.ok("y");
            else if (seq == 9999)
                return ResponseEntity.ok("z");
            else
                return ResponseEntity.ok("");
    }
}
