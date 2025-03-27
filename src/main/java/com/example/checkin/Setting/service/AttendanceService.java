@Service
public class AttendanceService {

    @Autowired
    private AttendanceRepository attendanceRepository;

    public void checkIn(AttendanceDto attendanceDto) {
        // 출석체크 로직 처리
        Attendance attendance = new Attendance();
        attendance.setStudentId(attendanceDto.getStudentId());
        attendance.setDate(LocalDate.now());
        attendance.setStatus("출석");
        attendanceRepository.save(attendance);
    }
}
