const HtmlWebpackPlugin = require('html-webpack-plugin');

module.exports = {
    entry: './src/index.tsx',
    module: {
        rules: [
            {
                test: /\.(js|jsx|ts|tsx)$/, // Match .js, .jsx, .ts, .tsx
                exclude: /node_modules/, // Don't transpile node_modules
                use: {
                    loader: 'babel-loader',
                    options: {
                        presets: [
                            '@babel/preset-env', // Transpile modern JavaScript
                            '@babel/preset-react', // Transpile JSX
                            '@babel/preset-typescript', // Transpile TypeScript
                        ],
                    },
                },
            },
            {
                test: /\.css$/i,
                use: ["style-loader", "css-loader"],
            },
        ],
    },
    resolve: {
        extensions: ['.tsx', '.ts', '.js'], // Resolve these file extensions
    },
    plugins: [
        new HtmlWebpackPlugin({
            template: './public/index.html',
            filename: './index.html',
        })
    ],
    devServer: {
        port: 5320,
        open: true,
        hot: true,
        historyApiFallback: true,
    }
};