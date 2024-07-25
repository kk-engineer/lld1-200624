package in.itkaran.lld1200624.lld2.factory;

import in.itkaran.lld1200624.lld2.factory.components.button.Button;
import in.itkaran.lld1200624.lld2.factory.components.button.IosButton;
import in.itkaran.lld1200624.lld2.factory.components.dropdown.DropDown;
import in.itkaran.lld1200624.lld2.factory.components.dropdown.IosDropDown;
import in.itkaran.lld1200624.lld2.factory.components.menu.Menu;

public class IosUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public DropDown createDropDown() {
        return new IosDropDown();
    }

    @Override
    public Menu createMenu() {
        return null;
    }
}
