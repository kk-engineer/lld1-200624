package in.itkaran.lld1200624.lld2.factory;

import in.itkaran.lld1200624.lld2.factory.components.button.Button;
import in.itkaran.lld1200624.lld2.factory.components.dropdown.DropDown;
import in.itkaran.lld1200624.lld2.factory.components.menu.Menu;

public interface UIFactory {
    Button createButton();
    DropDown createDropDown();
    Menu createMenu();
}
