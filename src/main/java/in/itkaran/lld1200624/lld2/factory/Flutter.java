package in.itkaran.lld1200624.lld2.factory;

public class Flutter {
    private SupportedPlatform platform;

    //Non-factory methods
    void refreshUI() {
        System.out.println("Refreshing UI");
    }

    void setTheme() {
        System.out.println("Setting theme");
    }

    UIFactory getUIFactory(SupportedPlatform platform) {
//        if (platform.equals(SupportedPlatform.WINDOWS)) {
//            return new WindowsUIFactory();
//        }
//        else if (platform.equals(SupportedPlatform.ANDROID)) {
//            return new AndroidUIFactory();
//        }
//        else if (platform.equals(SupportedPlatform.IOS)) {
//            return new IosUIFactory();
//        }
//
//        return null;
        return UIFactoryFactory.getUIFactory(platform);
    }
}
