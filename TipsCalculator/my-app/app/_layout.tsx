import { Tabs } from 'expo-router';

export default function Layout() {
  return (
    <Tabs>
      <Tabs.Screen name="home" options={{ title: 'Home', tabBarIcon: () => '🏠' }} />
      <Tabs.Screen name="explore" options={{ title: 'Explore', tabBarIcon: () => '🔍' }} />
    </Tabs>
  );
}
