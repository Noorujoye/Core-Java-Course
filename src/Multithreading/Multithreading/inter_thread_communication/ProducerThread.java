package Multithreading.Multithreading.inter_thread_communication;

class ProducerThread extends Thread {

    SharedResource resource;

    ProducerThread(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {
            try {
                resource.produce(i);
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
