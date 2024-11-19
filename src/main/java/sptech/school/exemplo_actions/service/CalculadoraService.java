@Service
public class CalculadoraService {

    public double dividir(double a, double b) {

        if (b == 0) {
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,
                "Divisão por zero não permitida"
            );
        }

        return a / b;
    }
}