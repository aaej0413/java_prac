package exception_handling;


/*
연결된 예외(chained exception) 예제
 */
public class Ex8_13 {
    public static void main(String[] args) {
        try {
            install2();
        } catch (InstallException2 e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void install2() throws InstallException2 {
        try {
            startInstall2();
            copyFiles2();
        } catch (SpaceException2 e) {
            InstallException2 ie = new InstallException2("설치중 예외발생");
            ie.initCause(e);
            throw ie;
        } catch (MemoryException2 me) {
            InstallException2 ie = new InstallException2("설치중 예외발생");
            ie.initCause(me);
            throw ie;
        } finally {
            deleteTempFiles2();
        }
    }

   static void startInstall2() throws SpaceException2,MemoryException2 {
        if(!enoughSpace2()) {
            throw new SpaceException2("설치할 공간이 부족합니다.");
        }
        if(!enoughMemory2()) {
            throw new MemoryException2("메모리가 부족합니다.");
        //  throw new RuntimeException(new MemoryException("메모리가 부족합니다."));
        }
    }

    static void copyFiles2() {}
    static void deleteTempFiles2() {}

    static boolean enoughMemory2() {
        return true;
    }

    static boolean enoughSpace2() {
        return false;
    }

    static class InstallException2 extends Exception {
        InstallException2(String msg) {
            super(msg);
        }
    }

    static class SpaceException2 extends Exception {
        SpaceException2(String msg) {
            super(msg);
        }
    }

    static class MemoryException2 extends Exception {
        MemoryException2(String msg) {
            super(msg);
        }
    }
}
