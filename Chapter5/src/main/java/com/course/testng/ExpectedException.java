package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {

    /*
    * ʲôʱ����õ��쳣���ԣ�
    * �������������Ϊĳһ���쳣��ʱ��
    * �������Ǵ�����ĳЩ���Ϸ��Ĳ����������׳����쳣
    * Ҳ����˵���ǵ����н����������쳣
    * */

    //    ����һ�����Խ��ʧ�ܵ��쳣����
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed() {
        System.out.println("����һ��ʧ�ܵ��쳣����");
    }

    //    ����һ���ɹ����쳣����
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExpectionSuccess() {
        System.out.println("�����ҵ��쳣����");
        throw new RuntimeException();
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExpectedS() {
        System.out.println("����һ���쳣���ԣ�����");
        throw new RuntimeException();
    }


}
