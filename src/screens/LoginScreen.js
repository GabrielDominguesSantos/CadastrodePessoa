import React, { useState } from 'react';
import { View, Text, TextInput, Button, StyleSheet, Dimensions } from 'react-native';

const windowWidth = Dimensions.get('window').width;

export default function LoginScreen({ navigation }) {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');
  const [error, setError] = useState('');

  const senhaLogin = () => {
    if (username === 'admin' && password === '1234') {
      setError('');
      navigation.navigate('Home');
    } else {
      setError('Login inválido. Tente novamente.');
    }
  };

  return (
    <View style={styles.container}>
      <Text style={styles.title}>Login</Text>

      <TextInput
        style={styles.input}
        placeholder="Usuário"
        value={username}
        onChangeText={setUsername}
      />
      <TextInput
        style={styles.input}
        placeholder="Senha"
        value={password}
        onChangeText={setPassword}
        secureTextEntry
      />

      {error ? <Text style={styles.error}>{error}</Text> : null}

      <View style={styles.buttonContainer}>
        <Button title="Login" onPress={senhaLogin} />
      </View>
    </View>
  );
}

const styles = StyleSheet.create({
    container: {
      flex: 1,
      justifyContent: 'center',
      alignItems: 'center',
      backgroundColor: '#f0f8ff', 
    },
    title: {
      fontSize: 24,
      marginBottom: 20,
    },
    input: {
      backgroundColor: '#fff',
      width: windowWidth * 0.5,
      padding: 10,
      marginBottom: 10,
      borderRadius: 5,
      borderWidth: 1,
      borderColor: '#ccc',
    },
    error: {
      color: 'red',
      marginBottom: 10,
    },
    buttonContainer: {
      backgroundColor: '#afeeee',
      margin: 10,
      width: windowWidth * 0.5,
      borderRadius: 5,
    },
  });
  