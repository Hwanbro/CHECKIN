@RestController
@RequestMapping("/api/attendance")
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    @PostMapping("/checkin")
    public ResponseEntity<String> checkIn(@RequestBody AttendanceDto attendanceDto) {
        attendanceService.checkIn(attendanceDto);
        return ResponseEntity.ok("출석 완료");
    }
}
