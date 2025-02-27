public class FakeExchange implements Exchange {
    @Override
    public float rate(String origin, String target) {
        // Use a fixed rate for testing purposes
        if (origin.equals("USD") && target.equals("Euro")) {
            return 0.96f;
        }
        // Default rate for other cases
        return 1.0f;
    }
}

