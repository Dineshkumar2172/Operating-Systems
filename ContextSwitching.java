public class ContextSwitching {
    /*

        🔹 Context Switching Explained
            
                Context switching is the process of saving and restoring the state of a CPU so that multiple processes can share a single CPU efficiently.

        🔹 Why is Context Switching Needed?
                A CPU can run only one process at a time (per core).
                If multiple processes need to run, the OS switches between them rapidly.
                This switching happens when:
                    A process is interrupted (e.g., waiting for I/O).
                    A higher-priority process needs the CPU.
                    Time-slice expires in multitasking (Round Robin scheduling).
        
        🔹 How Context Switching Works?
        1️⃣ Save Current Process State 📝

            The OS saves the CPU registers, program counter (PC), and stack pointer of the running process.
            This data is stored in the process control block (PCB).
        
        2️⃣ Load New Process State 🔄

            The OS selects a new process to run (based on scheduling).
            It restores the saved registers & program counter of the new process.
        
        3️⃣ Resume Execution 🚀

            The CPU resumes execution from where the new process left off.
        
            This switching happens in milliseconds, making it look like multiple programs run at the same time (even though a single CPU core can execute only one process at a time).

        🔹 Example of Context Switching
            Imagine you’re playing music on Spotify while coding in VS Code.
                The CPU runs your VS Code process → You type some code.
                Then, the music player needs CPU to process the next song.
                The OS switches from VS Code to Spotify by saving VS Code’s state and loading Spotify’s state.
                This happens so fast that you don’t notice the switch!
        
        🔹 Context Switching Overhead
            Takes time (saving/loading registers).
            Too many switches slow down performance (called thrashing).
            The OS tries to reduce unnecessary context switches for efficiency.
        
        🔹 Key Takeaways
        ✅ Context Switching allows multitasking by switching between processes.
        ✅ OS saves & restores process states to resume execution.
        ✅ Too many context switches slow down performance (overhead).
        ✅ It’s a fundamental part of process scheduling in an OS.

        💡 Without context switching, a CPU could only run one process until completion!

     */
}
