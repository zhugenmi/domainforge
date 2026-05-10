import { BrowserRouter } from "react-router-dom";
import DomainForgeLayout from "./components/DomainForgeLayout.tsx";
import { ChatSessionsProvider } from "./contexts/ChatSessionsContext.tsx";

function App() {
  return (
    <BrowserRouter>
      <ChatSessionsProvider>
        <DomainForgeLayout />
      </ChatSessionsProvider>
    </BrowserRouter>
  );
}

export default App;
