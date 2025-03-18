## Race Conditions

A **race condition** occurs when multiple threads or processes access shared resources concurrently, and the final outcome depends on the timing of their execution.

### Example Scenario:
- Two threads increment a shared counter simultaneously.
- Without proper synchronization, both threads read the same initial value, increment it, and write back an incorrect result.

### Prevention:
- Use **locks (mutex)** to ensure only one thread accesses the shared resource at a time.
- Use **atomic operations** to perform thread-safe updates.
- Apply **thread synchronization mechanisms** like semaphores and condition variables.

---

## Deadlocks

A **deadlock** occurs when two or more processes/threads are waiting for each other to release a resource, resulting in an indefinite wait.

### Example Scenario:
- Thread A locks Resource 1 and waits for Resource 2.
- Thread B locks Resource 2 and waits for Resource 1.
- Neither thread can proceed, causing a deadlock.

### Prevention:
- **Avoid circular wait:** Impose an ordering of resource acquisition.
- **Use timeouts:** Set maximum wait time before releasing resources.
- **Deadlock detection algorithms:** Monitor and resolve deadlocks dynamically.
- **Try-lock mechanism:** Acquire resources only if all required resources are available.

---

## Starvation

**Starvation** happens when a thread/process is perpetually denied access to resources because higher-priority processes always take precedence.

### Example Scenario:
- A low-priority thread waits indefinitely while high-priority threads continuously execute.

### Prevention:
- **Priority Aging:** Gradually increase the priority of waiting processes over time.
- **Fair Scheduling Algorithms:** Use algorithms like Round Robin to ensure fair CPU time allocation.
- **Resource Allocation Strategies:** Ensure fair access policies in concurrent systems.

