package topduals.topduals.models;

public class Result {

    private final boolean successful;
    private final String result;

    public Result(boolean successful, String result) {
        this.successful = successful;
        this.result = result;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public String getResult() {
        return result;
    }
}
