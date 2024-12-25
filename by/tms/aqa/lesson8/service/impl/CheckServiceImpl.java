package by.tms.aqa.lesson8.service.impl;

import by.tms.aqa.lesson8.entity.Phone;
import by.tms.aqa.lesson8.service.CheckService;

public class CheckServiceImpl implements CheckService {

    @Override
    public void checkDevice(Phone phone) {
        phone.call("+31675837530");
        phone.playMusic(67);
        phone.firmware();
    }
}
