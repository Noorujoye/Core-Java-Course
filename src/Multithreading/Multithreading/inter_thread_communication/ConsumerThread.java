package Multithreading.Multithreading.inter_thread_communication;

class ConsumerThread extends Thread {
    SharedResource resource;

    ConsumerThread(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {

        while (true) {
            try {
                resource.consume();
                Thread.sleep(1500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
