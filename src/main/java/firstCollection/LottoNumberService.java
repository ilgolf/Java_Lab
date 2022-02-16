package firstCollection;

import java.util.ArrayList;
import java.util.List;

public class LottoNumberService {

    private final int LOTTO_SIZE = 6;

    public void createNumber() {
        LottoTicket lottoTicket = new LottoTicket(createNonDuplicateNumbers());
    }

    private List<Long> createNonDuplicateNumbers() {
        List<Long> lotto = new ArrayList<>();

        for (int i = 0; i < LOTTO_SIZE; i++) {
            lotto.add((long) (Math.random() * 100) + 1);
        }

        return lotto;
    }
}
