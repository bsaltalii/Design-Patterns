package BuilderDesignPattern.PCExample;

import java.security.PublicKey;

public interface ComputerBuilder {
    public void cpu();
    public void ram();
    public void storage();
    public void gpu();
    public Computer build();
}
