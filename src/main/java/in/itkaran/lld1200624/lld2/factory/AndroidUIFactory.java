package in.itkaran.lld1200624.lld2.factory;

import in.itkaran.lld1200624.lld2.factory.components.button.AndroidButton;
import in.itkaran.lld1200624.lld2.factory.components.button.Button;
import in.itkaran.lld1200624.lld2.factory.components.dropdown.AndroidDropDown;
import in.itkaran.lld1200624.lld2.factory.components.dropdown.DropDown;
import in.itkaran.lld1200624.lld2.factory.components.menu.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }

    @Override
    public Menu createMenu() {
        return null;
    }
}
