// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// Version: 1.6.0.0

package protoex

import "errors"
import "../fbe"
import "../proto"

// Workaround for Go unused imports issue
var _ = errors.New
var _ = fbe.Version
var _ = proto.Version

// Proxy OrderMessage interface
type OnProxyOrderMessage interface {
    OnProxyOrderMessage(model *OrderMessageModel, fbeType int, buffer []byte)
}

// Proxy OrderMessage function
type OnProxyOrderMessageFunc func(model *OrderMessageModel, fbeType int, buffer []byte)
func (f OnProxyOrderMessageFunc) OnProxyOrderMessage(model *OrderMessageModel, fbeType int, buffer []byte) {
    f(model, fbeType, buffer)
}

// Proxy BalanceMessage interface
type OnProxyBalanceMessage interface {
    OnProxyBalanceMessage(model *BalanceMessageModel, fbeType int, buffer []byte)
}

// Proxy BalanceMessage function
type OnProxyBalanceMessageFunc func(model *BalanceMessageModel, fbeType int, buffer []byte)
func (f OnProxyBalanceMessageFunc) OnProxyBalanceMessage(model *BalanceMessageModel, fbeType int, buffer []byte) {
    f(model, fbeType, buffer)
}

// Proxy AccountMessage interface
type OnProxyAccountMessage interface {
    OnProxyAccountMessage(model *AccountMessageModel, fbeType int, buffer []byte)
}

// Proxy AccountMessage function
type OnProxyAccountMessageFunc func(model *AccountMessageModel, fbeType int, buffer []byte)
func (f OnProxyAccountMessageFunc) OnProxyAccountMessage(model *AccountMessageModel, fbeType int, buffer []byte) {
    f(model, fbeType, buffer)
}

// Fast Binary Encoding protoex proxy
type Proxy struct {
    *fbe.Receiver
    protoProxy *proto.Proxy
    orderMessageModel *OrderMessageModel
    balanceMessageModel *BalanceMessageModel
    accountMessageModel *AccountMessageModel

    // Proxy OrderMessage handler
    HandlerOnProxyOrderMessage OnProxyOrderMessage
    // Proxy BalanceMessage handler
    HandlerOnProxyBalanceMessage OnProxyBalanceMessage
    // Proxy AccountMessage handler
    HandlerOnProxyAccountMessage OnProxyAccountMessage
}

// Create a new protoex proxy with an empty buffer
func NewProxy() *Proxy {
    return NewProxyWithBuffer(fbe.NewEmptyBuffer())
}

// Create a new protoex proxy with the given buffer
func NewProxyWithBuffer(buffer *fbe.Buffer) *Proxy {
    proxy := &Proxy{
        fbe.NewReceiver(buffer, false),
        proto.NewProxyWithBuffer(buffer),
        NewOrderMessageModel(buffer),
        NewBalanceMessageModel(buffer),
        NewAccountMessageModel(buffer),
        nil,
        nil,
        nil,
    }
    proxy.SetupHandlerOnReceive(proxy)
    proxy.SetupHandlerOnProxyOrderMessageFunc(func(model *OrderMessageModel, fbeType int, buffer []byte) {})
    proxy.SetupHandlerOnProxyBalanceMessageFunc(func(model *BalanceMessageModel, fbeType int, buffer []byte) {})
    proxy.SetupHandlerOnProxyAccountMessageFunc(func(model *AccountMessageModel, fbeType int, buffer []byte) {})
    return proxy
}

// Imported proxy

// Get the proto proxy
func (p *Proxy) ProtoProxy() *proto.Proxy { return p.protoProxy }
// Set the proto proxy
func (p *Proxy) SetProtoProxy(proxy *proto.Proxy) { p.protoProxy = proxy }

// Setup handlers
func (p *Proxy) SetupHandlers(handlers interface{}) {
    p.Receiver.SetupHandlers(handlers)
    p.protoProxy.SetupHandlers(handlers)
    if handler, ok := handlers.(OnProxyOrderMessage); ok {
        p.SetupHandlerOnProxyOrderMessage(handler)
    }
    if handler, ok := handlers.(OnProxyBalanceMessage); ok {
        p.SetupHandlerOnProxyBalanceMessage(handler)
    }
    if handler, ok := handlers.(OnProxyAccountMessage); ok {
        p.SetupHandlerOnProxyAccountMessage(handler)
    }
}

// Setup proxy OrderMessage handler
func (p *Proxy) SetupHandlerOnProxyOrderMessage(handler OnProxyOrderMessage) { p.HandlerOnProxyOrderMessage = handler }
// Setup proxy OrderMessage handler function
func (p *Proxy) SetupHandlerOnProxyOrderMessageFunc(function func(model *OrderMessageModel, fbeType int, buffer []byte)) { p.HandlerOnProxyOrderMessage = OnProxyOrderMessageFunc(function) }
// Setup proxy BalanceMessage handler
func (p *Proxy) SetupHandlerOnProxyBalanceMessage(handler OnProxyBalanceMessage) { p.HandlerOnProxyBalanceMessage = handler }
// Setup proxy BalanceMessage handler function
func (p *Proxy) SetupHandlerOnProxyBalanceMessageFunc(function func(model *BalanceMessageModel, fbeType int, buffer []byte)) { p.HandlerOnProxyBalanceMessage = OnProxyBalanceMessageFunc(function) }
// Setup proxy AccountMessage handler
func (p *Proxy) SetupHandlerOnProxyAccountMessage(handler OnProxyAccountMessage) { p.HandlerOnProxyAccountMessage = handler }
// Setup proxy AccountMessage handler function
func (p *Proxy) SetupHandlerOnProxyAccountMessageFunc(function func(model *AccountMessageModel, fbeType int, buffer []byte)) { p.HandlerOnProxyAccountMessage = OnProxyAccountMessageFunc(function) }

// Receive message handler
func (p *Proxy) OnReceive(fbeType int, buffer []byte) (bool, error) {
    switch fbeType {
    case p.orderMessageModel.FBEType():
        // Attach the FBE stream to the proxy model
        p.orderMessageModel.Buffer().Attach(buffer)
        if !p.orderMessageModel.Verify() {
            return false, errors.New("protoex.OrderMessage validation failed")
        }

        fbeBegin, err := p.orderMessageModel.model.GetBegin()
        if fbeBegin == 0 {
            return false, err
        }
        // Call proxy handler
        p.HandlerOnProxyOrderMessage.OnProxyOrderMessage(p.orderMessageModel, fbeType, buffer)
        p.orderMessageModel.model.GetEnd(fbeBegin)
        return true, nil
    case p.balanceMessageModel.FBEType():
        // Attach the FBE stream to the proxy model
        p.balanceMessageModel.Buffer().Attach(buffer)
        if !p.balanceMessageModel.Verify() {
            return false, errors.New("protoex.BalanceMessage validation failed")
        }

        fbeBegin, err := p.balanceMessageModel.model.GetBegin()
        if fbeBegin == 0 {
            return false, err
        }
        // Call proxy handler
        p.HandlerOnProxyBalanceMessage.OnProxyBalanceMessage(p.balanceMessageModel, fbeType, buffer)
        p.balanceMessageModel.model.GetEnd(fbeBegin)
        return true, nil
    case p.accountMessageModel.FBEType():
        // Attach the FBE stream to the proxy model
        p.accountMessageModel.Buffer().Attach(buffer)
        if !p.accountMessageModel.Verify() {
            return false, errors.New("protoex.AccountMessage validation failed")
        }

        fbeBegin, err := p.accountMessageModel.model.GetBegin()
        if fbeBegin == 0 {
            return false, err
        }
        // Call proxy handler
        p.HandlerOnProxyAccountMessage.OnProxyAccountMessage(p.accountMessageModel, fbeType, buffer)
        p.accountMessageModel.model.GetEnd(fbeBegin)
        return true, nil
    default:
        _ = fbeType
        break
    }

    if p.protoProxy != nil {
        if ok, err := p.protoProxy.OnReceive(fbeType, buffer); ok {
            return ok, err
        }
    }

    return false, nil
}
