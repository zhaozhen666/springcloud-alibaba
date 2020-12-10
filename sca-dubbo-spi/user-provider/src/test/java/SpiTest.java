import com.zhao.sca.spi.PrintService;
import org.apache.dubbo.common.extension.ExtensionLoader;

public class SpiTest {


    public static void main(String[] args) {
        PrintService printService = ExtensionLoader.getExtensionLoader(PrintService.class)
                .getDefaultExtension();

        printService.printInfo();
    }


}
