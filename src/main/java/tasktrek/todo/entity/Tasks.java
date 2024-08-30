package tasktrek.todo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Tasks extends Timestamped{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;

    @Column(nullable = false, length = 100)
    @Size(max = 100, message = "100자 이하로 작성해주세요.")
    private String title;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Label label;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Priority priority;

    @Builder
    public Tasks(String title, Label label, Status status, Priority priority) {
        this.title = title;
        this.label = label;
        this.status = status;
        this.priority = priority;
    }


}
