package optional;

import java.util.Optional;

public class OptionalExtraction {

    public String getInsuranceName(Person person) {
        Optional<Person> optPerson = Optional.of(person);

        return optPerson
                .flatMap(Person::getCar)
                .flatMap(Car::getInsurance)
                .map(Insurance::getName)
                .orElseThrow(() -> new IllegalArgumentException("개체가 존재하지 않습니다."));
    }

    public static void main(String[] args) {
        Insurance insurance = new Insurance("삼성화재");
        Optional<Insurance> insuranceOp = Optional.of(insurance);

        Optional<String> name = insuranceOp.map(Insurance::getName);
    }
}
