import java.time.LocalDateTime;

class Consulta {
    LocalDateTime data;

    Consulta(LocalDateTime data) {
        this.data = data;
    }

    public LocalDateTime getData() {
        return data;
    }
}
