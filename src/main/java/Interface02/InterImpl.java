package Interface02;

public class InterImpl implements Inter01,Inter02,Inter03{

    @Override
    public void eat(){
        System.out.println("interImpl eat");
    }

    @Override
    public void drink() {
        System.out.println("interImpl drink");
    }
}
